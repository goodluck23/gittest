package cc.iotkit.common.thing;

import cc.iotkit.temporal.es.document.DocThingModelMessage;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-28T21:55:33+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class ThingModelMessageToDocThingModelMessageMapperImpl implements ThingModelMessageToDocThingModelMessageMapper {

    @Override
    public DocThingModelMessage convert(ThingModelMessage arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DocThingModelMessage docThingModelMessage = new DocThingModelMessage();

        docThingModelMessage.setId( arg0.getId() );
        docThingModelMessage.setMid( arg0.getMid() );
        docThingModelMessage.setDeviceId( arg0.getDeviceId() );
        docThingModelMessage.setProductKey( arg0.getProductKey() );
        docThingModelMessage.setDeviceName( arg0.getDeviceName() );
        docThingModelMessage.setType( arg0.getType() );
        docThingModelMessage.setIdentifier( arg0.getIdentifier() );
        docThingModelMessage.setCode( arg0.getCode() );
        docThingModelMessage.setData( arg0.getData() );
        docThingModelMessage.setOccurred( arg0.getOccurred() );
        docThingModelMessage.setTime( arg0.getTime() );

        return docThingModelMessage;
    }

    @Override
    public DocThingModelMessage convert(ThingModelMessage arg0, DocThingModelMessage arg1) {
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
