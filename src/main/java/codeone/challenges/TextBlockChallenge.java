package codeone.challenges;

public class TextBlockChallenge {
  public static void main(String... doYourBest) {
    String jediWithoutTextBlock = ""
        + "<html>\n"
        + "    <head>Master Yoda</head> %s\n"
        + "</html>"
        .strip().formatted("Luke");

    String jediWithTextBlock = """
        <html>
            <head>Master Yoda</head> %s
        </html>
        """.strip().formatted("Luke");

    System.out.println(jediWithoutTextBlock.equals(jediWithTextBlock));
    System.out.println(jediWithoutTextBlock.formatted("Luke").equals(jediWithTextBlock));
  }
}
