package dzOOP_06;

public class ReportEntryPoint {
    
    public static Report create(Document document, String reportType) {
        ReportGenerator reportGenerator = ReportTypes.reportGenerators.get(reportType.toUpperCase());
        if (reportGenerator == null) {
            throw new UnsupportedOperationException();
        }
        return reportGenerator.generateReport(document);
    }
}
