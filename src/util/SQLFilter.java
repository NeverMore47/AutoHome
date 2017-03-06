package util;

import java.lang.reflect.Field;


public class SQLFilter {

	//替换sql语句方法
	public static String sqlFilter(String sql,Object obj) {
		Class<? extends Object> clazz = obj.getClass();
		Field fields[] = clazz.getDeclaredFields();

		for (Field field : fields) {
			try {
				field.setAccessible(true);
				sql = sql.replaceAll("\\{" + field.getName() + "\\}",
						field.get(obj) + "");
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}

		}
		
		return sql;
	}
}
