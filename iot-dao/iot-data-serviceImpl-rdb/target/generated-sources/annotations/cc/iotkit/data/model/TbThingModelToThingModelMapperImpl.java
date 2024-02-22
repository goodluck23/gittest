package cc.iotkit.data.model;

import cc.iotkit.model.product.ThingModel;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbThingModelToThingModelMapperImpl implements TbThingModelToThingModelMapper {

    @Override
    public ThingModel convert(TbThingModel source) {
        if ( source == null ) {
            return null;
        }

        ThingModel thingModel = new ThingModel();

        thingModel.setId( source.getId() );
        thingModel.setProductKey( source.getProductKey() );

        return thingModel;
    }

    @Override
    public ThingModel convert(TbThingModel source, ThingModel target) {
        if ( source == null ) {
            return target;
        }

        target.setId( source.getId() );
        target.setProductKey( source.getProductKey() );

        return target;
    }
}
