package factory;

import model.Product;
import org.bson.Document;
import system.mongo.core.IDynamicObject;
import system.mongo.core.data.IMongoObjectFactory;
import system.mongo.core.data.MongoDynamicObject;

import java.util.UUID;

public class ProductFactory implements IMongoObjectFactory {
    @Override
    public Object createObject(Document document) {
        Product product = new Product();
        if (document.get("id") != null) {
            product.setId(document.get("id").toString());
        }
        if (document.get("name") != null) {
            product.setName(document.get("name").toString());
        }
        if (document.get("image") != null) {
            product.setImage(document.get("image").toString());
        }
        if (document.get("price") != null) {
            product.setPrice(Double.parseDouble(document.get("price").toString()));
        }
        if (document.get("idCatalog") != null) {
            product.setCatalogId(document.get("idCatalog").toString());
        }
        return product;
    }
    public IDynamicObject createObject(Product model){
        IDynamicObject iDynamicObject = null;
        if (null == model.getId() || model.getId().length() == 0) {
            iDynamicObject = new MongoDynamicObject(UUID.randomUUID().toString());
        } else {
            iDynamicObject = new MongoDynamicObject(model.getId());
        }
        iDynamicObject.put("name", model.getName());
        iDynamicObject.put("image",model.getImage());
        iDynamicObject.put("price",model.getPrice());
        iDynamicObject.put("catalogId",model.getCatalogId());
        return iDynamicObject;
    }
}
