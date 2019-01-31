import java.util.stream.Collector;

class IssueCoverage {
  static Collector<IssueWiseText, ?, Double> collector() {
    return Collector.of(
            Accumulator::new, Accumulator::accumulate, Accumulator::combine, Accumulator::finish,
            Collector.Characteristics.UNORDERED
    );
  }

  private static class Accumulator {
    int totalIssueLength = 0;
    int totalTextLength = 0;

    void accumulate(IssueWiseText issueWiseText) {
      totalIssueLength += issueWiseText.issues().stream().mapToInt(Issue::length).sum();
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
