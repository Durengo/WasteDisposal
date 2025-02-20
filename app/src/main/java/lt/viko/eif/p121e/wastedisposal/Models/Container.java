package lt.viko.eif.p121e.wastedisposal.Models;

import lt.viko.eif.p121e.wastedisposal.Models.Enums.ContainerContentType;
import lt.viko.eif.p121e.wastedisposal.Models.Enums.ContainerType;
import lt.viko.eif.p121e.wastedisposal.Util.Converters.ContainerContentTypeConverter;
import lt.viko.eif.p121e.wastedisposal.Util.Converters.ContainerTypeConverter;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

@Entity(tableName = "tbl_containers", foreignKeys = {
        @ForeignKey(entity = BranchAddress.class, parentColumns = "branch_id", childColumns = "branch_id")
})
public class Container {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "container_id")
    private int id;
    @ColumnInfo(name = "branch_id")
    private int branchId;
    @ColumnInfo(name = "street")
    private String street;
    @ColumnInfo(name = "house_number")
    private String houseNumber;
    @ColumnInfo(name = "zip_code")
    private String zipCode;
    @ColumnInfo(name = "capacity")
    private float capacity;
    @TypeConverters(ContainerTypeConverter.class)
    @ColumnInfo(name = "type")
    private ContainerType type;
    @TypeConverters(ContainerContentTypeConverter.class)
    @ColumnInfo(name = "content_type")
    private ContainerContentType contentType;

    public Container(int branchId, String street, String houseNumber, String zipCode, float capacity,
                     ContainerType type, ContainerContentType contentType) {
        this.branchId = branchId;
        this.street = street;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
        this.capacity = capacity;
        this.type = type;
        this.contentType = contentType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public ContainerType getType() {
        return type;
    }

    public void setType(ContainerType type) {
        this.type = type;
    }

    public ContainerContentType getContentType() {
        return contentType;
    }

    public void setContentType(ContainerContentType contentType) {
        this.contentType = contentType;
    }
}
