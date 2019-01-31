interface Issue {
  int startOffset(); // e.g. 4 (start of "migth")

  int endOffset(); // e.g. 9 (end of "migth")

  IssueType type(); // e.g. SPELLING

  double probability(); // e.g. 0.7836
}
