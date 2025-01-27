package ua.lviv.iot.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "supermarket")
public class Supermarket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "description")
    private String description;

    @Column(name = "area_size_in_meters")
    private Integer areaSizeInMeters;

    @Column(name = "work_scheudle_start")
    private String workScheudleStart;

    @Column(name = "work_scheudle_end")
    private String workScheudleEnd;

    @Column(name = "average_customers_amount")
    private Integer averageCustomersAmount;

    @Column(name = "house_id")
    private Integer houseId;

    public Supermarket() {
    }

    public Supermarket(String description, Integer areaSizeInMeters,
                       String workScheudleStart, String workScheudleEnd, Integer averageCustomersAmount, Integer houseId){
        this(-1, description, areaSizeInMeters, workScheudleStart, workScheudleEnd, averageCustomersAmount, houseId);
    }

    public Supermarket(Integer id, String description, Integer areaSizeInMeters,
                       String workScheudleStart, String workScheudleEnd, Integer averageCustomersAmount, Integer houseId) {
        this.id = id;
        this.description = description;
        this.areaSizeInMeters = areaSizeInMeters;
        this.workScheudleStart = workScheudleStart;
        this.workScheudleEnd = workScheudleEnd;
        this.averageCustomersAmount = averageCustomersAmount;
        this.houseId = houseId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAreaSizeInMeters() {
        return areaSizeInMeters;
    }

    public void setAreaSizeInMeters(Integer areaSizeInMeters) {
        this.areaSizeInMeters = areaSizeInMeters;
    }

    public String getWorkScheudleStart() {
        return workScheudleStart;
    }

    public void setWorkScheudleStart(String workScheudleStart) {
        this.workScheudleStart = workScheudleStart;
    }

    public String getWorkScheudleEnd() {
        return workScheudleEnd;
    }

    public void setWorkScheudleEnd(String workScheudleEnd) {
        this.workScheudleEnd = workScheudleEnd;
    }

    public Integer getAverageCustomersAmount() {
        return averageCustomersAmount;
    }

    public void setAverageCustomersAmount(Integer averageCustomersAmount) {
        this.averageCustomersAmount = averageCustomersAmount;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    @Override
    public String toString() {
        return "Supermarket{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", areaSizeInMeters=" + areaSizeInMeters +
                ", workScheudleStart=" + workScheudleStart +
                ", workScheudleEnd=" + workScheudleEnd +
                ", averageCustomersAmount=" + averageCustomersAmount +
                ", houseId=" + houseId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supermarket that = (Supermarket) o;
        return id.equals(that.id) &&
                Objects.equals(description, that.description) &&
                areaSizeInMeters.equals(that.areaSizeInMeters) &&
                workScheudleStart.equals(that.workScheudleStart) &&
                workScheudleEnd.equals(that.workScheudleEnd) &&
                Objects.equals(averageCustomersAmount, that.averageCustomersAmount) &&
                houseId.equals(that.houseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, areaSizeInMeters, workScheudleStart, workScheudleEnd, averageCustomersAmount, houseId);
    }
}
