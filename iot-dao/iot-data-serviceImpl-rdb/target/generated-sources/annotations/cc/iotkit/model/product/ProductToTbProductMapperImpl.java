package cc.iotkit.model.product;

import cc.iotkit.data.model.TbProduct;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class ProductToTbProductMapperImpl implements ProductToTbProductMapper {

    @Override
    public TbProduct convert(Product arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbProduct tbProduct = new TbProduct();

        tbProduct.setId( arg0.getId() );
        tbProduct.setTenantId( arg0.getTenantId() );
        tbProduct.setProductKey( arg0.getProductKey() );
        tbProduct.setProductSecret( arg0.getProductSecret() );
        tbProduct.setName( arg0.getName() );
        tbProduct.setCategory( arg0.getCategory() );
        tbProduct.setNodeType( arg0.getNodeType() );
        tbProduct.setUid( arg0.getUid() );
        tbProduct.setImg( arg0.getImg() );
        tbProduct.setTransparent( arg0.getTransparent() );
        tbProduct.setIsOpenLocate( arg0.getIsOpenLocate() );
        tbProduct.setLocateUpdateType( arg0.getLocateUpdateType() );
        tbProduct.setCreateAt( arg0.getCreateAt() );

        return tbProduct;
    }

    @Override
    public TbProduct convert(Product arg0, TbProduct arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setTenantId( arg0.getTenantId() );
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
