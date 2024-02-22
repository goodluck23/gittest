package cc.iotkit.data.model;

import cc.iotkit.model.product.Product;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbProductToProductMapperImpl implements TbProductToProductMapper {

    @Override
    public Product convert(TbProduct arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Product product = new Product();

        product.setTenantId( arg0.getTenantId() );
        product.setId( arg0.getId() );
        product.setProductKey( arg0.getProductKey() );
        product.setProductSecret( arg0.getProductSecret() );
        product.setName( arg0.getName() );
        product.setCategory( arg0.getCategory() );
        product.setNodeType( arg0.getNodeType() );
        product.setUid( arg0.getUid() );
        product.setImg( arg0.getImg() );
        product.setTransparent( arg0.getTransparent() );
        product.setIsOpenLocate( arg0.getIsOpenLocate() );
        product.setLocateUpdateType( arg0.getLocateUpdateType() );
        product.setCreateAt( arg0.getCreateAt() );

        return product;
    }

    @Override
    public Product convert(TbProduct arg0, Product arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setTenantId( arg0.getTenantId() );
        arg1.setId( arg0.getId() );
        arg1.setProductKey( arg0.getProductKey() );
        arg1.setProductSecret( arg0.getProductSecret() );
        arg1.setName( arg0.getName() );
        arg1.setCategory( arg0.getCategory() );
        arg1.setNodeType( arg0.getNodeType() );
        arg1.setUid( arg0.getUid() );
        arg1.setImg( arg0.getImg() );
        arg1.setTransparent( arg0.getTransparent() );
        arg1.setIsOpenLocate( arg0.getIsOpenLocate() );
        arg1.setLocateUpdateType( arg0.getLocateUpdateType() );
        arg1.setCreateAt( arg0.getCreateAt() );

        return arg1;
    }
}
