package cc.iotkit.model.rule;

import cc.iotkit.data.model.TbRuleInfo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class RuleInfoToTbRuleInfoMapperImpl implements RuleInfoToTbRuleInfoMapper {

    @Override
    public TbRuleInfo convert(RuleInfo source) {
        if ( source == null ) {
            return null;
        }

        TbRuleInfo tbRuleInfo = new TbRuleInfo();

        tbRuleInfo.setId( source.getId() );
        tbRuleInfo.setName( source.getName() );
        tbRuleInfo.setType( source.getType() );
        tbRuleInfo.setUid( source.getUid() );
        tbRuleInfo.setState( source.getState() );
        tbRuleInfo.setDesc( source.getDesc() );
        tbRuleInfo.setCreateAt( source.getCreateAt() );

        return tbRuleInfo;
    }

    @Override
    public TbRuleInfo convert(RuleInfo source, TbRuleInfo target) {
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
