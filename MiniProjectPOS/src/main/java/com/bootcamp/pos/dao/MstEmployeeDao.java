package com.bootcamp.pos.dao;

import java.util.List;

import com.bootcamp.pos.model.MstEmployeeModel;
import com.bootcamp.pos.viewmodel.MstEmployeeViewModel;

public interface MstEmployeeDao {

	public List<MstEmployeeModel> get() throws Exception;
	public List<MstEmployeeModel> search(String keySearch) throws Exception;
	public MstEmployeeModel getById(Integer id) throws Exception;
	public MstEmployeeModel getByEmail(String email) throws Exception;
	public void insert(MstEmployeeViewModel model) throws Exception;
	public void update(MstEmployeeModel model) throws Exception;
	public void delete(MstEmployeeModel model) throws Exception;
}
