package cc.iotkit.model.product;

import cc.iotkit.data.model.TbThingModel;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:18+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class ThingModelToTbThingModelMapperImpl implements ThingModelToTbThingModelMapper {

    @Override
    public TbThingModel convert(ThingModel source) {
        if ( source == null ) {
            return null;
        }

        TbThingModel tbThingModel = new TbThingModel();

        tbThingModel.setId( source.getId() );
        tbThingModel.setProductKey( source.getProductKey() );

        return tbThingModel;
    }

    @Override
    public TbThingModel convert(ThingModel source, TbThingModel target) {
        if ( source == null ) {
            return target;
        }

        target.setId( source.getId() );
        target.setProductKey( source.getProductKey() );

        return target;
    }
}
