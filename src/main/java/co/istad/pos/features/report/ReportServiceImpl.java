package co.istad.pos.features.report;

import co.istad.pos.domain.Inventory;
import co.istad.pos.domain.Sale;
import co.istad.pos.features.Sale.SaleRepository;
import co.istad.pos.features.inventory.InventoryRepository;
import co.istad.pos.features.report.dto.ReportResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReportServiceImpl implements ReportService{

    private final InventoryRepository inventoryRepository;
    private final SaleRepository saleRepository;


    @Override
    public ReportResponse getSalesReport() {
        List<Sale> sales = saleRepository.findAll();

        return ReportResponse.builder()
                .reportName("Sales Report")
                .data(sales)
                .build();
    }

    @Override
    public ReportResponse getInventoryReport() {

        List<Inventory> inventories = inventoryRepository.findAll();

        return ReportResponse.builder()
                .reportName("Inventory Report")
                .data(inventories)
                .build();


    }
}
