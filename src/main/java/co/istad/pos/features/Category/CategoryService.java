package co.istad.pos.features.Category;

import co.istad.pos.features.Category.dto.CategoryRequest;
import co.istad.pos.features.Category.dto.CategoryResponse;
import co.istad.pos.utils.CustomPage;

public interface CategoryService {

    CustomPage<CategoryResponse> findAll(int page, int size);
    CategoryResponse getCategoryByUuid(String uuid);
    CategoryResponse createCategory(CategoryRequest request);
    CategoryResponse updateCategory(String uuid, CategoryRequest request);
    void deleteCategory(String uuid);
    CategoryResponse disableCategory(String uuid);
    CategoryResponse enableCategory(String uuid);


}
