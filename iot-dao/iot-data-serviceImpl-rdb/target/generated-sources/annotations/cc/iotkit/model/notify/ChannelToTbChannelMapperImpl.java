package cc.iotkit.model.notify;

import cc.iotkit.data.model.TbChannel;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class ChannelToTbChannelMapperImpl implements ChannelToTbChannelMapper {

    @Override
    public TbChannel convert(Channel arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbChannel tbChannel = new TbChannel();

        tbChannel.setId( arg0.getId() );
        tbChannel.setCode( arg0.getCode() );
        tbChannel.setTitle( arg0.getTitle() );
        tbChannel.setIcon( arg0.getIcon() );
        tbChannel.setCreateAt( arg0.getCreateAt() );

        return tbChannel;
    }

    @Override
    public TbChannel convert(Channel arg0, TbChannel arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setCode( arg0.getCode() );
        arg1.setTitle( arg0.getTitle() );
        arg1.setIcon( arg0.getIcon() );
        arg1.setCreateAt( arg0.getCreateAt() );

        return arg1;
    }
}
