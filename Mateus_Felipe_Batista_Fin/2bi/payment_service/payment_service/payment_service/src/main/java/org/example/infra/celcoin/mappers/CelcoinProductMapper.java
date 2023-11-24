package main.java.org.example.infra.celcoin.mappers;


import main.java.org.example.domain.dto.ProductDTO;
import main.java.org.example.infra.celcoin.dto.CelcoinProductDTO;

public class CelcoinProductMapper {
    public static ProductDTO toAppDTO (CelcoinProductDTO vendorDTO) {
        ProductDTO appDTO = new ProductDTO();

        appDTO.setCode(vendorDTO.getCode());
        appDTO.setCost(vendorDTO.getCost());
        appDTO.setDueProduct(vendorDTO.getDueProduct());
        appDTO.setValue(vendorDTO.getMinValue());
        appDTO.setName(vendorDTO.getProductName());

        return appDTO;
    }
}
