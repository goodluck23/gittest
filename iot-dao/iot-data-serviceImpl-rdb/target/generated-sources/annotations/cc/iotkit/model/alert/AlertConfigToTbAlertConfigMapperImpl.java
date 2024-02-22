package cc.iotkit.model.alert;

import cc.iotkit.data.model.TbAlertConfig;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:18+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class AlertConfigToTbAlertConfigMapperImpl implements AlertConfigToTbAlertConfigMapper {

    @Override
    public TbAlertConfig convert(AlertConfig arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbAlertConfig tbAlertConfig = new TbAlertConfig();

        tbAlertConfig.setId( arg0.getId() );
        tbAlertConfig.setUid( arg0.getUid() );
        tbAlertConfig.setName( arg0.getName() );
        tbAlertConfig.setLevel( arg0.getLevel() );
        tbAlertConfig.setRuleInfoId( arg0.getRuleInfoId() );
        tbAlertConfig.setMessageTemplateId( arg0.getMessageTemplateId() );
        tbAlertConfig.setDescription( arg0.getDescription() );
        tbAlertConfig.setEnable( arg0.getEnable() );
        tbAlertConfig.setCreateAt( arg0.getCreateAt() );

        return tbAlertConfig;
    }

    @Override
    public TbAlertConfig convert(AlertConfig arg0, TbAlertConfig arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setUid( arg0.getUid() );
        arg1.setName( arg0.getName() );
        arg1.setLevel( arg0.getLevel() );
        arg1.setRuleInfoId( arg0.getRuleInfoId() );
        arg1.setMessageTemplateId( arg0.getMessageTemplateId() );
        arg1.setDescription( arg0.getDescription() );
        arg1.setEnable( arg0.getEnable() );
        arg1.setCreateAt( arg0.getCreateAt() );

        return arg1;
    }
}
