package sda.wzorce.openclosed.excercise;

public class JsonReportPrinter implements ContentPrinter {

    @Override
    public void printContent(Report report) {
        System.out.println("{");
        System.out.println(report.getContent());
        System.out.println("}");
    }
}
