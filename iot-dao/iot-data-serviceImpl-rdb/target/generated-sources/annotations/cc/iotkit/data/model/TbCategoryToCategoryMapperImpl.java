package cc.iotkit.data.model;

import cc.iotkit.model.product.Category;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:18+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbCategoryToCategoryMapperImpl implements TbCategoryToCategoryMapper {

    @Override
    public Category convert(TbCategory arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Category category = new Category();

        category.setId( arg0.getId() );
        category.setName( arg0.getName() );
        category.setCreateAt( arg0.getCreateAt() );

        return category;
    }

    @Override
    public Category convert(TbCategory arg0, Category arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setName( arg0.getName() );
        arg1.setCreateAt( arg0.getCreateAt() );

        return arg1;
    }
}
