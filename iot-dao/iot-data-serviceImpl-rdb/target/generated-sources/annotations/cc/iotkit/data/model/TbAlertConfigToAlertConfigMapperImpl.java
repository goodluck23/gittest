package cc.iotkit.data.model;

import cc.iotkit.model.alert.AlertConfig;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbAlertConfigToAlertConfigMapperImpl implements TbAlertConfigToAlertConfigMapper {

    @Override
    public AlertConfig convert(TbAlertConfig arg0) {
        if ( arg0 == null ) {
            return null;
        }

        AlertConfig alertConfig = new AlertConfig();

        alertConfig.setId( arg0.getId() );
        alertConfig.setUid( arg0.getUid() );
        alertConfig.setName( arg0.getName() );
        alertConfig.setLevel( arg0.getLevel() );
        alertConfig.setRuleInfoId( arg0.getRuleInfoId() );
        alertConfig.setMessageTemplateId( arg0.getMessageTemplateId() );
        alertConfig.setDescription( arg0.getDescription() );
        alertConfig.setEnable( arg0.getEnable() );
        alertConfig.setCreateAt( arg0.getCreateAt() );

        return alertConfig;
    }

    @Override
    public AlertConfig convert(TbAlertConfig arg0, AlertConfig arg1) {
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
