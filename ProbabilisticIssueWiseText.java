import java.util.List;
import java.util.function.Predicate;

interface ProbabilisticIssueWiseText extends IssueWiseText {
  @Override
  List<? extends ProbableIssue> issues();

  @Override
  default ProbabilisticIssueWiseText filtered(Predicate<? super Issue> issueFilter) {
    return filteredProbabilistic(issueFilter);
  }

  ProbabilisticIssueWiseText filteredProbabilistic(Predicate<? super ProbableIssue> issueFilter);
}
