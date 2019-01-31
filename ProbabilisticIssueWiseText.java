import java.util.List;

interface ProbabilisticIssueWiseText extends IssueWiseText {
  @Override
  List<? extends ProbableIssue> issues();

  @Override
  Filterer<? extends ProbabilisticIssueWiseText, ? extends ProbableIssue> filtered();
}
