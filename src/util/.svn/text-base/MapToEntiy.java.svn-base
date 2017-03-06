package util;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.Map;

public class MapToEntiy {

	public static Object convert(Map map, Class clazz) {
		Field fields[] = clazz.getDeclaredFields();
		Object obj = null;
		try {
			obj = clazz.newInstance();
			for (Field field : fields) {
				field.setAccessible(true);
				String fieldType = field.getType().getName();
				String value[] = (String[]) map.get(field.getName());
				if (value != null) {
					if (fieldType.equals("int")) {
						field.set(obj, Integer.parseInt(value[0]));
					} else if (fieldType.equals("java.lang.String")) {
						try {
							String param = new String(
									value[0].getBytes("iso-8859-1"), "UTF-8");
							field.set(obj, value[0]);
						} catch (UnsupportedEncodingException e) {
							e.printStackTrace();
						}
					}
				}
			}
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
}
