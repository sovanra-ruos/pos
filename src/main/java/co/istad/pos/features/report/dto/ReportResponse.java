package co.istad.pos.features.report.dto;

import lombok.Builder;

import java.util.List;

@Builder
public record ReportResponse(
        String reportName,
        List<?> data
) {
}
