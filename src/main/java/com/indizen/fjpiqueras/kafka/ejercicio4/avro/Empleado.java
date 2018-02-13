/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.indizen.fjpiqueras.kafka.ejercicio4.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
/** Empleado schema */
@org.apache.avro.specific.AvroGenerated
public class Empleado extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8309084703705045093L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Empleado\",\"namespace\":\"com.indizen.fjpiqueras.kafka.ejercicio4.avro\",\"doc\":\"Empleado schema\",\"fields\":[{\"name\":\"nombre\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"Nombre del empleado\"},{\"name\":\"apellidos\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"Apellidos del empleado\"},{\"name\":\"email\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"Nombre del empleado\"},{\"name\":\"telefono\",\"type\":[\"int\",\"null\"],\"doc\":\"Numero de telefono\"},{\"name\":\"skills\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"Lista de skills separadas por coma\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Empleado> ENCODER =
      new BinaryMessageEncoder<Empleado>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Empleado> DECODER =
      new BinaryMessageDecoder<Empleado>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Empleado> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Empleado> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Empleado>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Empleado to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Empleado from a ByteBuffer. */
  public static Empleado fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Nombre del empleado */
  @Deprecated public java.lang.String nombre;
  /** Apellidos del empleado */
  @Deprecated public java.lang.String apellidos;
  /** Nombre del empleado */
  @Deprecated public java.lang.String email;
  /** Numero de telefono */
  @Deprecated public java.lang.Integer telefono;
  /** Lista de skills separadas por coma */
  @Deprecated public java.lang.String skills;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Empleado() {}

  /**
   * All-args constructor.
   * @param nombre Nombre del empleado
   * @param apellidos Apellidos del empleado
   * @param email Nombre del empleado
   * @param telefono Numero de telefono
   * @param skills Lista de skills separadas por coma
   */
  public Empleado(java.lang.String nombre, java.lang.String apellidos, java.lang.String email, java.lang.Integer telefono, java.lang.String skills) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.email = email;
    this.telefono = telefono;
    this.skills = skills;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return nombre;
    case 1: return apellidos;
    case 2: return email;
    case 3: return telefono;
    case 4: return skills;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: nombre = (java.lang.String)value$; break;
    case 1: apellidos = (java.lang.String)value$; break;
    case 2: email = (java.lang.String)value$; break;
    case 3: telefono = (java.lang.Integer)value$; break;
    case 4: skills = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'nombre' field.
   * @return Nombre del empleado
   */
  public java.lang.String getNombre() {
    return nombre;
  }

  /**
   * Sets the value of the 'nombre' field.
   * Nombre del empleado
   * @param value the value to set.
   */
  public void setNombre(java.lang.String value) {
    this.nombre = value;
  }

  /**
   * Gets the value of the 'apellidos' field.
   * @return Apellidos del empleado
   */
  public java.lang.String getApellidos() {
    return apellidos;
  }

  /**
   * Sets the value of the 'apellidos' field.
   * Apellidos del empleado
   * @param value the value to set.
   */
  public void setApellidos(java.lang.String value) {
    this.apellidos = value;
  }

  /**
   * Gets the value of the 'email' field.
   * @return Nombre del empleado
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * Sets the value of the 'email' field.
   * Nombre del empleado
   * @param value the value to set.
   */
  public void setEmail(java.lang.String value) {
    this.email = value;
  }

  /**
   * Gets the value of the 'telefono' field.
   * @return Numero de telefono
   */
  public java.lang.Integer getTelefono() {
    return telefono;
  }

  /**
   * Sets the value of the 'telefono' field.
   * Numero de telefono
   * @param value the value to set.
   */
  public void setTelefono(java.lang.Integer value) {
    this.telefono = value;
  }

  /**
   * Gets the value of the 'skills' field.
   * @return Lista de skills separadas por coma
   */
  public java.lang.String getSkills() {
    return skills;
  }

  /**
   * Sets the value of the 'skills' field.
   * Lista de skills separadas por coma
   * @param value the value to set.
   */
  public void setSkills(java.lang.String value) {
    this.skills = value;
  }

  /**
   * Creates a new Empleado RecordBuilder.
   * @return A new Empleado RecordBuilder
   */
  public static com.indizen.fjpiqueras.kafka.ejercicio4.avro.Empleado.Builder newBuilder() {
    return new com.indizen.fjpiqueras.kafka.ejercicio4.avro.Empleado.Builder();
  }

  /**
   * Creates a new Empleado RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Empleado RecordBuilder
   */
  public static com.indizen.fjpiqueras.kafka.ejercicio4.avro.Empleado.Builder newBuilder(com.indizen.fjpiqueras.kafka.ejercicio4.avro.Empleado.Builder other) {
    return new com.indizen.fjpiqueras.kafka.ejercicio4.avro.Empleado.Builder(other);
  }

  /**
   * Creates a new Empleado RecordBuilder by copying an existing Empleado instance.
   * @param other The existing instance to copy.
   * @return A new Empleado RecordBuilder
   */
  public static com.indizen.fjpiqueras.kafka.ejercicio4.avro.Empleado.Builder newBuilder(com.indizen.fjpiqueras.kafka.ejercicio4.avro.Empleado other) {
    return new com.indizen.fjpiqueras.kafka.ejercicio4.avro.Empleado.Builder(other);
  }

  /**
   * RecordBuilder for Empleado instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Empleado>
    implements org.apache.avro.data.RecordBuilder<Empleado> {

    /** Nombre del empleado */
    private java.lang.String nombre;
    /** Apellidos del empleado */
    private java.lang.String apellidos;
    /** Nombre del empleado */
    private java.lang.String email;
    /** Numero de telefono */
    private java.lang.Integer telefono;
    /** Lista de skills separadas por coma */
    private java.lang.String skills;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.indizen.fjpiqueras.kafka.ejercicio4.avro.Empleado.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.nombre)) {
        this.nombre = data().deepCopy(fields()[0].schema(), other.nombre);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.apellidos)) {
        this.apellidos = data().deepCopy(fields()[1].schema(), other.apellidos);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.email)) {
        this.email = data().deepCopy(fields()[2].schema(), other.email);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.telefono)) {
        this.telefono = data().deepCopy(fields()[3].schema(), other.telefono);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.skills)) {
        this.skills = data().deepCopy(fields()[4].schema(), other.skills);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Empleado instance
     * @param other The existing instance to copy.
     */
    private Builder(com.indizen.fjpiqueras.kafka.ejercicio4.avro.Empleado other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.nombre)) {
        this.nombre = data().deepCopy(fields()[0].schema(), other.nombre);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.apellidos)) {
        this.apellidos = data().deepCopy(fields()[1].schema(), other.apellidos);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.email)) {
        this.email = data().deepCopy(fields()[2].schema(), other.email);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.telefono)) {
        this.telefono = data().deepCopy(fields()[3].schema(), other.telefono);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.skills)) {
        this.skills = data().deepCopy(fields()[4].schema(), other.skills);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'nombre' field.
      * Nombre del empleado
      * @return The value.
      */
    public java.lang.String getNombre() {
      return nombre;
    }

    /**
      * Sets the value of the 'nombre' field.
      * Nombre del empleado
      * @param value The value of 'nombre'.
      * @return This builder.
      */
    public com.indizen.fjpiqueras.kafka.ejercicio4.avro.Empleado.Builder setNombre(java.lang.String value) {
      validate(fields()[0], value);
      this.nombre = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'nombre' field has been set.
      * Nombre del empleado
      * @return True if the 'nombre' field has been set, false otherwise.
      */
    public boolean hasNombre() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'nombre' field.
      * Nombre del empleado
      * @return This builder.
      */
    public com.indizen.fjpiqueras.kafka.ejercicio4.avro.Empleado.Builder clearNombre() {
      nombre = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'apellidos' field.
      * Apellidos del empleado
      * @return The value.
      */
    public java.lang.String getApellidos() {
      return apellidos;
    }

    /**
      * Sets the value of the 'apellidos' field.
      * Apellidos del empleado
      * @param value The value of 'apellidos'.
      * @return This builder.
      */
    public com.indizen.fjpiqueras.kafka.ejercicio4.avro.Empleado.Builder setApellidos(java.lang.String value) {
      validate(fields()[1], value);
      this.apellidos = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'apellidos' field has been set.
      * Apellidos del empleado
      * @return True if the 'apellidos' field has been set, false otherwise.
      */
    public boolean hasApellidos() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'apellidos' field.
      * Apellidos del empleado
      * @return This builder.
      */
    public com.indizen.fjpiqueras.kafka.ejercicio4.avro.Empleado.Builder clearApellidos() {
      apellidos = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'email' field.
      * Nombre del empleado
      * @return The value.
      */
    public java.lang.String getEmail() {
      return email;
    }

    /**
      * Sets the value of the 'email' field.
      * Nombre del empleado
      * @param value The value of 'email'.
      * @return This builder.
      */
    public com.indizen.fjpiqueras.kafka.ejercicio4.avro.Empleado.Builder setEmail(java.lang.String value) {
      validate(fields()[2], value);
      this.email = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'email' field has been set.
      * Nombre del empleado
      * @return True if the 'email' field has been set, false otherwise.
      */
    public boolean hasEmail() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'email' field.
      * Nombre del empleado
      * @return This builder.
      */
    public com.indizen.fjpiqueras.kafka.ejercicio4.avro.Empleado.Builder clearEmail() {
      email = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'telefono' field.
      * Numero de telefono
      * @return The value.
      */
    public java.lang.Integer getTelefono() {
      return telefono;
    }

    /**
      * Sets the value of the 'telefono' field.
      * Numero de telefono
      * @param value The value of 'telefono'.
      * @return This builder.
      */
    public com.indizen.fjpiqueras.kafka.ejercicio4.avro.Empleado.Builder setTelefono(java.lang.Integer value) {
      validate(fields()[3], value);
      this.telefono = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'telefono' field has been set.
      * Numero de telefono
      * @return True if the 'telefono' field has been set, false otherwise.
      */
    public boolean hasTelefono() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'telefono' field.
      * Numero de telefono
      * @return This builder.
      */
    public com.indizen.fjpiqueras.kafka.ejercicio4.avro.Empleado.Builder clearTelefono() {
      telefono = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'skills' field.
      * Lista de skills separadas por coma
      * @return The value.
      */
    public java.lang.String getSkills() {
      return skills;
    }

    /**
      * Sets the value of the 'skills' field.
      * Lista de skills separadas por coma
      * @param value The value of 'skills'.
      * @return This builder.
      */
    public com.indizen.fjpiqueras.kafka.ejercicio4.avro.Empleado.Builder setSkills(java.lang.String value) {
      validate(fields()[4], value);
      this.skills = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'skills' field has been set.
      * Lista de skills separadas por coma
      * @return True if the 'skills' field has been set, false otherwise.
      */
    public boolean hasSkills() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'skills' field.
      * Lista de skills separadas por coma
      * @return This builder.
      */
    public com.indizen.fjpiqueras.kafka.ejercicio4.avro.Empleado.Builder clearSkills() {
      skills = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Empleado build() {
      try {
        Empleado record = new Empleado();
        record.nombre = fieldSetFlags()[0] ? this.nombre : (java.lang.String) defaultValue(fields()[0]);
        record.apellidos = fieldSetFlags()[1] ? this.apellidos : (java.lang.String) defaultValue(fields()[1]);
        record.email = fieldSetFlags()[2] ? this.email : (java.lang.String) defaultValue(fields()[2]);
        record.telefono = fieldSetFlags()[3] ? this.telefono : (java.lang.Integer) defaultValue(fields()[3]);
        record.skills = fieldSetFlags()[4] ? this.skills : (java.lang.String) defaultValue(fields()[4]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Empleado>
    WRITER$ = (org.apache.avro.io.DatumWriter<Empleado>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Empleado>
    READER$ = (org.apache.avro.io.DatumReader<Empleado>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
