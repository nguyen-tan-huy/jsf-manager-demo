package factory;

import model.Catalog;
import org.bson.Document;
import system.mongo.core.IDynamicObject;
import system.mongo.core.data.IMongoObjectFactory;
import system.mongo.core.data.MongoDynamicObject;

import java.util.UUID;

public class CatalogFactory implements IMongoObjectFactory<Catalog> {
    @Override
    public Catalog createObject(Document document) {
        Catalog catalog = new Catalog();
        if (document.get("id") != null) {
            catalog.setId(document.get("id").toString());
        }
        if (document.get("name") != null) {
            catalog.setName(document.get("name").toString());
        }
        return catalog;
    }

    public IDynamicObject createObject(Catalog model){
        IDynamicObject iDynamicObject = null;
        if (null == model.getId() || model.getId().length() == 0) {
            iDynamicObject = new MongoDynamicObject(UUID.randomUUID().toString());
        } else {
            iDynamicObject = new MongoDynamicObject(model.getId());
        }
        iDynamicObject.put("name", model.getName());

        return iDynamicObject;
    }
}
