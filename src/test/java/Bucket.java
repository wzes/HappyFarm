import com.haveacupofjava.happyfarm.field.AbstractField;
import com.haveacupofjava.happyfarm.field.AbstractPen;
import com.haveacupofjava.happyfarm.produce.AbstractProduce;
import com.haveacupofjava.happyfarm.product.AbstractTool;
import com.haveacupofjava.happyfarm.room.storage.StorageRoom;

import java.util.List;

public class Bucket extends AbstractTool {

    public Bucket() {
        setName("bucket");
        setPrice(9.0);
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public Bucket clone() {
        Bucket bucket = new Bucket();
        bucket.setName(this.getName());
        return bucket;
    }

    @Override
    public void handleField(AbstractField field) {
        List<AbstractProduce> produceList = ((AbstractPen) field).getMilkProduce();

        for (AbstractProduce produce : produceList) {
            StorageRoom.getInstance().store(produce);
        }
    }

}