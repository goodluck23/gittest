package cc.iotkit.data.model;

import cc.iotkit.model.notify.ChannelTemplate;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbChannelTemplateToChannelTemplateMapperImpl implements TbChannelTemplateToChannelTemplateMapper {

    @Override
    public ChannelTemplate convert(TbChannelTemplate arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ChannelTemplate channelTemplate = new ChannelTemplate();

        channelTemplate.setId( arg0.getId() );
        channelTemplate.setChannelConfigId( arg0.getChannelConfigId() );
        channelTemplate.setTitle( arg0.getTitle() );
        channelTemplate.setContent( arg0.getContent() );
        channelTemplate.setCreateAt( arg0.getCreateAt() );

        return channelTemplate;
    }

    @Override
    public ChannelTemplate convert(TbChannelTemplate arg0, ChannelTemplate arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setChannelConfigId( arg0.getChannelConfigId() );
        arg1.setTitle( arg0.getTitle() );
        arg1.setContent( arg0.getContent() );
        arg1.setCreateAt( arg0.getCreateAt() );

        return arg1;
    }
}
