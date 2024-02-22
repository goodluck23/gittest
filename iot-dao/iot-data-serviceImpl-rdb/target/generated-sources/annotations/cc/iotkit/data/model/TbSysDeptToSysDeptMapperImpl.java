package cc.iotkit.data.model;

import cc.iotkit.model.system.SysDept;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbSysDeptToSysDeptMapperImpl implements TbSysDeptToSysDeptMapper {

    @Override
    public SysDept convert(TbSysDept arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysDept sysDept = new SysDept();

        sysDept.setCreateDept( arg0.getCreateDept() );
        sysDept.setCreateBy( arg0.getCreateBy() );
        sysDept.setUpdateBy( arg0.getUpdateBy() );
        sysDept.setUpdateTime( arg0.getUpdateTime() );
        sysDept.setId( arg0.getId() );
        sysDept.setParentId( arg0.getParentId() );
        sysDept.setAncestors( arg0.getAncestors() );
        sysDept.setDeptName( arg0.getDeptName() );
        sysDept.setOrderNum( arg0.getOrderNum() );
        sysDept.setLeader( arg0.getLeader() );
        sysDept.setPhone( arg0.getPhone() );
        sysDept.setEmail( arg0.getEmail() );
        sysDept.setStatus( arg0.getStatus() );
        sysDept.setCreateTime( arg0.getCreateTime() );
        sysDept.setTenantId( arg0.getTenantId() );

        return sysDept;
    }

    @Override
    public SysDept convert(TbSysDept arg0, SysDept arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setCreateDept( arg0.getCreateDept() );
        arg1.setCreateBy( arg0.getCreateBy() );
        arg1.setUpdateBy( arg0.getUpdateBy() );
        arg1.setUpdateTime( arg0.getUpdateTime() );
        arg1.setId( arg0.getId() );
        arg1.setParentId( arg0.getParentId() );
        arg1.setAncestors( arg0.getAncestors() );
        arg1.setDeptName( arg0.getDeptName() );
        arg1.setOrderNum( arg0.getOrderNum() );
        arg1.setLeader( arg0.getLeader() );
        arg1.setPhone( arg0.getPhone() );
        arg1.setEmail( arg0.getEmail() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setCreateTime( arg0.getCreateTime() );
        arg1.setTenantId( arg0.getTenantId() );

        return arg1;
    }
}
