package com.PetShop.persistence.mapper;

import com.PetShop.domain.dto.InvoiceDetailDTO;
import com.PetShop.persistence.entity.InvoiceDetail;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface InvoiceDetailMapper {
    @Mappings({
            @Mapping(source = "invoiceDetailId", target = "id"),
            @Mapping(source = "quantity", target = "quantity"),
            @Mapping(source = "unitPrice", target = "unitPrice"),
            @Mapping(source = "invoice", target = "invoice"),
            @Mapping(source = "product", target = "product")
    })
    InvoiceDetailDTO toInvoiceDetailDTO(InvoiceDetail invoiceDetail);
    List<InvoiceDetailDTO> toInvoiceDetailDTO(List<InvoiceDetail> invoiceDetails);

    @InheritInverseConfiguration
    InvoiceDetail toInvoiceDetail(InvoiceDetailDTO invoiceDetailDTO);
}
