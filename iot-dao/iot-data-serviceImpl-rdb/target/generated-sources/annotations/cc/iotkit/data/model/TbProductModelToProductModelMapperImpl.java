package cc.iotkit.data.model;

import cc.iotkit.model.product.ProductModel;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbProductModelToProductModelMapperImpl implements TbProductModelToProductModelMapper {

    @Override
    public ProductModel convert(TbProductModel arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ProductModel productModel = new ProductModel();

        productModel.setId( arg0.getId() );
        productModel.setModel( arg0.getModel() );
        productModel.setName( arg0.getName() );
        productModel.setProductKey( arg0.getProductKey() );
        productModel.setType( arg0.getType() );
        productModel.setScript( arg0.getScript() );
        productModel.setState( arg0.getState() );
        productModel.setModifyAt( arg0.getModifyAt() );

        return productModel;
    }

    @Override
    public ProductModel convert(TbProductModel arg0, ProductModel arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setModel( arg0.getModel() );
        arg1.setName( arg0.getName() );
        arg1.setProductKey( arg0.getProductKey() );
        arg1.setType( arg0.getType() );
        arg1.setScript( arg0.getScript() );
        arg1.setState( arg0.getState() );
        arg1.setModifyAt( arg0.getModifyAt() );

        return arg1;
    }
}
