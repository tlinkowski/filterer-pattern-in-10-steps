import java.util.function.Predicate;
import java.util.stream.Collector;

class IssueCoverage {
  static Collector<IssueWiseText<?>, ?, Double> collector(Predicate<? super Issue> issueFilter) {
    return Collector.of(
            () -> new Accumulator(issueFilter), Accumulator::accumulate, Accumulator::combine, Accumulator::finish,
            Collector.Characteristics.UNORDERED
    );
  }

  private static class Accumulator {
    private final Predicate<? super Issue> issueFilter;

    int totalIssueLength = 0;
    int totalTextLength = 0;

    Accumulator(Predicate<? super Issue> issueFilter) {
      this.issueFilter = issueFilter;
    }

    void accumulate(IssueWiseText<?> issueWiseText) {
      totalIssueLength += issueWiseText.issues().stream().filter(issueFilter).mapToInt(Issue::length).sum();
      totalTextLength += issueWiseText.text().length();
    }

    Accumulator combine(Accumulator other) {
      totalIssueLength += other.totalIssueLength;
      totalTextLength += other.totalTextLength;
      return this;
    }

    double finish() {
      return (double) totalIssueLength / totalTextLength;
    }
  }
}
