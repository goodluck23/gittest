package cc.iotkit.temporal.es.document;

import cc.iotkit.model.rule.RuleLog;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-28T21:55:34+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class DocRuleLogToRuleLogMapperImpl implements DocRuleLogToRuleLogMapper {

    @Override
    public RuleLog convert(DocRuleLog arg0) {
        if ( arg0 == null ) {
            return null;
        }

        RuleLog ruleLog = new RuleLog();

        ruleLog.setId( arg0.getId() );
        ruleLog.setRuleId( arg0.getRuleId() );
        ruleLog.setState( arg0.getState() );
        ruleLog.setContent( arg0.getContent() );
        ruleLog.setSuccess( arg0.getSuccess() );
        ruleLog.setLogAt( arg0.getLogAt() );

        return ruleLog;
    }

    @Override
    public RuleLog convert(DocRuleLog arg0, RuleLog arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setRuleId( arg0.getRuleId() );
        arg1.setState( arg0.getState() );
        arg1.setContent( arg0.getContent() );
        arg1.setSuccess( arg0.getSuccess() );
        arg1.setLogAt( arg0.getLogAt() );

        return arg1;
    }
}
