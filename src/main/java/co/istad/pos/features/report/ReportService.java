package co.istad.pos.features.report;

import co.istad.pos.features.report.dto.ReportResponse;

public interface ReportService {
    ReportResponse getSalesReport();
    ReportResponse getInventoryReport();
}
