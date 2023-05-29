package in.ineuron.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.model.Product;
import in.ineuron.repository.IProductRepository;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	private IProductRepository repo;

	@Override
	public List<Product> fetchAllProduct() {
		return (List<Product>) repo.findAll();
	}

}
