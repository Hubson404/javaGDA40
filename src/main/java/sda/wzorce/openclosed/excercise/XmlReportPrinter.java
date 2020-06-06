package sda.wzorce.openclosed.excercise;

public class XmlReportPrinter implements ContentPrinter {

    @Override
    public void printContent(Report report) {
        System.out.println("<xml>");
        System.out.println("<content>");
        System.out.println(report.getContent());
        System.out.println("</content>");
        System.out.println("</xml>");
    }
}
