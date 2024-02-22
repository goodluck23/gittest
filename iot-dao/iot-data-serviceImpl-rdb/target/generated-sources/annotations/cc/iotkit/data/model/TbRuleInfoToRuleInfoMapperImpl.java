package cc.iotkit.data.model;

import cc.iotkit.model.rule.RuleInfo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbRuleInfoToRuleInfoMapperImpl implements TbRuleInfoToRuleInfoMapper {

    @Override
    public RuleInfo convert(TbRuleInfo source) {
        if ( source == null ) {
            return null;
        }

        RuleInfo ruleInfo = new RuleInfo();

        ruleInfo.setId( source.getId() );
        ruleInfo.setName( source.getName() );
        ruleInfo.setType( source.getType() );
        ruleInfo.setUid( source.getUid() );
        ruleInfo.setState( source.getState() );
        ruleInfo.setDesc( source.getDesc() );
        ruleInfo.setCreateAt( source.getCreateAt() );

        return ruleInfo;
    }

    @Override
    public RuleInfo convert(TbRuleInfo source, RuleInfo target) {
        if ( source == null ) {
            return target;
        }

        target.setId( source.getId() );
        target.setName( source.getName() );
        target.setType( source.getType() );
        target.setUid( source.getUid() );
        target.setState( source.getState() );
        target.setDesc( source.getDesc() );
        target.setCreateAt( source.getCreateAt() );

        return target;
    }
}
