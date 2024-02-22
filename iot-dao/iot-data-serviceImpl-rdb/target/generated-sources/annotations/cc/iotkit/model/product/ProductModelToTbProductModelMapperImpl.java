package cc.iotkit.model.product;

import cc.iotkit.data.model.TbProductModel;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class ProductModelToTbProductModelMapperImpl implements ProductModelToTbProductModelMapper {

    @Override
    public TbProductModel convert(ProductModel arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbProductModel tbProductModel = new TbProductModel();

        tbProductModel.setId( arg0.getId() );
        tbProductModel.setModel( arg0.getModel() );
        tbProductModel.setName( arg0.getName() );
        tbProductModel.setProductKey( arg0.getProductKey() );
        tbProductModel.setType( arg0.getType() );
        tbProductModel.setScript( arg0.getScript() );
        tbProductModel.setState( arg0.getState() );
        tbProductModel.setModifyAt( arg0.getModifyAt() );

        return tbProductModel;
    }

    @Override
    public TbProductModel convert(ProductModel arg0, TbProductModel arg1) {
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
