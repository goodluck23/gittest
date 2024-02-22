package cc.iotkit.temporal.es.document;

import cc.iotkit.common.thing.ThingModelMessage;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-28T21:55:33+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class DocThingModelMessageToThingModelMessageMapperImpl implements DocThingModelMessageToThingModelMessageMapper {

    @Override
    public ThingModelMessage convert(DocThingModelMessage arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ThingModelMessage thingModelMessage = new ThingModelMessage();

        thingModelMessage.setId( arg0.getId() );
        thingModelMessage.setMid( arg0.getMid() );
        thingModelMessage.setDeviceId( arg0.getDeviceId() );
        thingModelMessage.setProductKey( arg0.getProductKey() );
        thingModelMessage.setDeviceName( arg0.getDeviceName() );
        thingModelMessage.setType( arg0.getType() );
        thingModelMessage.setIdentifier( arg0.getIdentifier() );
        thingModelMessage.setCode( arg0.getCode() );
        thingModelMessage.setData( arg0.getData() );
        thingModelMessage.setOccurred( arg0.getOccurred() );
        thingModelMessage.setTime( arg0.getTime() );

        return thingModelMessage;
    }

    @Override
    public ThingModelMessage convert(DocThingModelMessage arg0, ThingModelMessage arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setMid( arg0.getMid() );
        arg1.setDeviceId( arg0.getDeviceId() );
        arg1.setProductKey( arg0.getProductKey() );
        arg1.setDeviceName( arg0.getDeviceName() );
        arg1.setType( arg0.getType() );
        arg1.setIdentifier( arg0.getIdentifier() );
        arg1.setCode( arg0.getCode() );
        arg1.setData( arg0.getData() );
        arg1.setOccurred( arg0.getOccurred() );
        arg1.setTime( arg0.getTime() );

        return arg1;
    }
}
