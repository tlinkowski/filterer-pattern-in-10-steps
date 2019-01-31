import java.util.stream.Stream;

class Usage {
  static double issueCoverage(Stream<? extends IssueWiseText<?>> textStream) {
    return textStream.collect(IssueCoverage.collector());
  }

  static Stream<IssueWiseText<Issue>> testCaseStream() {
    return Stream.of();
  }
}
