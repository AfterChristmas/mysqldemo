package com.itwanyan.mysqldemo.service.impl;

import com.itwanyan.mysqldemo.model.entity.Animal;
import com.itwanyan.mysqldemo.mapper.AnimalMapper;
import com.itwanyan.mysqldemo.service.IAnimalService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wan yan dong chen
 * @since 2021-02-01
 */
@Service
public class AnimalService extends ServiceImpl<AnimalMapper, Animal> implements IAnimalService {

}
