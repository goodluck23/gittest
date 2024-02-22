package cc.iotkit.model.system;

import cc.iotkit.data.model.TbSysDept;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:18+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class SysDeptToTbSysDeptMapperImpl implements SysDeptToTbSysDeptMapper {

    @Override
    public TbSysDept convert(SysDept arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbSysDept tbSysDept = new TbSysDept();

        tbSysDept.setCreateDept( arg0.getCreateDept() );
        tbSysDept.setCreateBy( arg0.getCreateBy() );
        tbSysDept.setCreateTime( arg0.getCreateTime() );
        tbSysDept.setUpdateBy( arg0.getUpdateBy() );
        tbSysDept.setUpdateTime( arg0.getUpdateTime() );
        tbSysDept.setId( arg0.getId() );
        tbSysDept.setTenantId( arg0.getTenantId() );
        tbSysDept.setParentId( arg0.getParentId() );
        tbSysDept.setDeptName( arg0.getDeptName() );
        tbSysDept.setOrderNum( arg0.getOrderNum() );
        tbSysDept.setLeader( arg0.getLeader() );
        tbSysDept.setPhone( arg0.getPhone() );
        tbSysDept.setEmail( arg0.getEmail() );
        tbSysDept.setStatus( arg0.getStatus() );
        tbSysDept.setAncestors( arg0.getAncestors() );

        return tbSysDept;
    }

    @Override
    public TbSysDept convert(SysDept arg0, TbSysDept arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setCreateDept( arg0.getCreateDept() );
        arg1.setCreateBy( arg0.getCreateBy() );
        arg1.setCreateTime( arg0.getCreateTime() );
        arg1.setUpdateBy( arg0.getUpdateBy() );
        arg1.setUpdateTime( arg0.getUpdateTime() );
        arg1.setId( arg0.getId() );
        arg1.setTenantId( arg0.getTenantId() );
        arg1.setParentId( arg0.getParentId() );
        arg1.setDeptName( arg0.getDeptName() );
        arg1.setOrderNum( arg0.getOrderNum() );
        arg1.setLeader( arg0.getLeader() );
        arg1.setPhone( arg0.getPhone() );
        arg1.setEmail( arg0.getEmail() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setAncestors( arg0.getAncestors() );

        return arg1;
    }
}
