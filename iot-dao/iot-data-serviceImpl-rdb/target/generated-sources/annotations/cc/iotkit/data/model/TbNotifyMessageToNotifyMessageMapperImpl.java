package cc.iotkit.data.model;

import cc.iotkit.model.notify.NotifyMessage;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbNotifyMessageToNotifyMessageMapperImpl implements TbNotifyMessageToNotifyMessageMapper {

    @Override
    public NotifyMessage convert(TbNotifyMessage arg0) {
        if ( arg0 == null ) {
            return null;
        }

        NotifyMessage notifyMessage = new NotifyMessage();

        notifyMessage.setId( arg0.getId() );
        notifyMessage.setContent( arg0.getContent() );
        notifyMessage.setMessageType( arg0.getMessageType() );
        notifyMessage.setStatus( arg0.getStatus() );
        notifyMessage.setCreateAt( arg0.getCreateAt() );
        notifyMessage.setUpdateAt( arg0.getUpdateAt() );

        return notifyMessage;
    }

    @Override
    public NotifyMessage convert(TbNotifyMessage arg0, NotifyMessage arg1) {
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
