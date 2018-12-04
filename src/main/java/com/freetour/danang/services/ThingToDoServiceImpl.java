package com.freetour.danang.services;

import com.freetour.danang.dao.models.Category;
import com.freetour.danang.dao.models.Menu;
import com.freetour.danang.dao.models.Restaurant;
import com.freetour.danang.dao.repositories.CategoryRepository;
import com.freetour.danang.dao.repositories.MenuRepository;
import com.freetour.danang.dao.repositories.RestaurantRepository;
import com.freetour.danang.dto.CategoryDTO;
import com.freetour.danang.dto.MenuDTO;
import com.freetour.danang.dto.RestaurantDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ThingToDoServiceImpl implements ThingToDoService{
    private RestaurantRepository restaurantRepository;
    private CategoryRepository categoryRepository;
    private MenuRepository menuRepository;

    public ThingToDoServiceImpl(RestaurantRepository restaurantRepository, CategoryRepository categoryRepository, MenuRepository menuRepository) {
        this.restaurantRepository = restaurantRepository;
        this.categoryRepository = categoryRepository;
        this.menuRepository = menuRepository;
    }

    @Override
    public List<CategoryDTO> getRestaurant() {
        List<CategoryDTO> list = new ArrayList<>();
        List<Category> categories = categoryRepository.findAll();
        for (Category category: categories){
            CategoryDTO categoryDTO = new CategoryDTO();
            categoryDTO.setName(category.getName());
            list.add(categoryDTO);
          }
        return list;
    }



    @Override
    public List<RestaurantDTO> getListResEat() {
        List<RestaurantDTO> restaurantDTOList = new ArrayList<>();
        List<Restaurant> restaurants = restaurantRepository.findEat();
        for (Restaurant restaurant:restaurants){
            RestaurantDTO restaurantDTO = new RestaurantDTO();
            restaurantDTO.setId(restaurant.getId());
            restaurantDTO.setName(restaurant.getName());
            restaurantDTO.setShortInfo(restaurant.getShortInfo());
            restaurantDTO.setPriceUS(restaurant.getPriceUS());
            restaurantDTO.setPriceVN(restaurant.getPriceVN());
            restaurantDTOList.add(restaurantDTO);
        }
        return restaurantDTOList;
    }

    @Override
    public List<RestaurantDTO> getListResDrink() {
        List<RestaurantDTO> restaurantDTOList = new ArrayList<>();
        List<Restaurant> restaurants = restaurantRepository.findDrink();
        for (Restaurant restaurant:restaurants){
            RestaurantDTO restaurantDTO = new RestaurantDTO();
            restaurantDTO.setId(restaurant.getId());
            restaurantDTO.setName(restaurant.getName());
            restaurantDTO.setShortInfo(restaurant.getShortInfo());
            restaurantDTO.setPriceUS(restaurant.getPriceUS());
            restaurantDTO.setPriceVN(restaurant.getPriceVN());
            restaurantDTOList.add(restaurantDTO);
        }
        return restaurantDTOList;
    }

    @Override
    public RestaurantDTO getPartNer(Long id) {
        Restaurant restaurant = restaurantRepository.listById(id);
        RestaurantDTO restaurantDTO = new RestaurantDTO();
        restaurantDTO.setName(restaurant.getName());
        restaurantDTO.setInfo(restaurant.getInfo());
        restaurantDTO.setAddress(restaurant.getAddress());
        restaurantDTO.setOpenCloseTime(restaurant.getTimeOC());
        restaurantDTO.setPriceUS(restaurant.getPriceUS());
        restaurantDTO.setPriceVN(restaurant.getPriceVN());
        restaurantDTO.setPhone(restaurant.getPhone());
        restaurantDTO.setLinkMap(restaurant.getLinkMap());

        List<Long> list = new ArrayList<>();
        Menu menu = new Menu();
        menu.getId();
        menu.getName();


        return restaurantDTO;
    }
}
