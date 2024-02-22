package cc.iotkit.model.notify;

import cc.iotkit.data.model.TbChannelTemplate;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:18+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class ChannelTemplateToTbChannelTemplateMapperImpl implements ChannelTemplateToTbChannelTemplateMapper {

    @Override
    public TbChannelTemplate convert(ChannelTemplate arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbChannelTemplate tbChannelTemplate = new TbChannelTemplate();

        tbChannelTemplate.setId( arg0.getId() );
        tbChannelTemplate.setChannelConfigId( arg0.getChannelConfigId() );
        tbChannelTemplate.setTitle( arg0.getTitle() );
        tbChannelTemplate.setContent( arg0.getContent() );
        tbChannelTemplate.setCreateAt( arg0.getCreateAt() );

        return tbChannelTemplate;
    }

    @Override
    public TbChannelTemplate convert(ChannelTemplate arg0, TbChannelTemplate arg1) {
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
