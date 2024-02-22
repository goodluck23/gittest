package cc.iotkit.model.notify;

import cc.iotkit.data.model.TbNotifyMessage;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:17+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class NotifyMessageToTbNotifyMessageMapperImpl implements NotifyMessageToTbNotifyMessageMapper {

    @Override
    public TbNotifyMessage convert(NotifyMessage arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbNotifyMessage tbNotifyMessage = new TbNotifyMessage();

        tbNotifyMessage.setId( arg0.getId() );
        tbNotifyMessage.setContent( arg0.getContent() );
        tbNotifyMessage.setMessageType( arg0.getMessageType() );
        tbNotifyMessage.setStatus( arg0.getStatus() );
        tbNotifyMessage.setCreateAt( arg0.getCreateAt() );
        tbNotifyMessage.setUpdateAt( arg0.getUpdateAt() );

        return tbNotifyMessage;
    }

    @Override
    public TbNotifyMessage convert(NotifyMessage arg0, TbNotifyMessage arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setContent( arg0.getContent() );
        arg1.setMessageType( arg0.getMessageType() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setCreateAt( arg0.getCreateAt() );
        arg1.setUpdateAt( arg0.getUpdateAt() );

        return arg1;
    }
}
