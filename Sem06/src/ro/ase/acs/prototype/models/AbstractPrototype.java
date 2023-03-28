package ro.ase.acs.prototype.models;

public interface AbstractPrototype extends Cloneable{
    public AbstractPrototype createCopy() throws CloneNotSupportedException;
}
