import java.util.List;
import java.util.function.Predicate;

interface ProbabilisticIssueWiseText extends IssueWiseText {
  @Override
  List<? extends ProbableIssue> issues();

  @Override
  ProbabilisticIssueWiseText filtered(Predicate<? super Issue> issueFilter);
}
