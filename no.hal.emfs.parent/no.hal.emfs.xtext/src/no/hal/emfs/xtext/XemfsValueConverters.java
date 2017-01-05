package no.hal.emfs.xtext;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter;
import org.eclipse.xtext.nodemodel.INode;

public class XemfsValueConverters extends DefaultTerminalConverters {

	@ValueConverter(rule = "FolderName")
	public IValueConverter<String> FolderName() {
		return new FixValueConverter(null, "/");
	}

//	@ValueConverter(rule = "FileName")
//	public IValueConverter<String> FileName() {
//		return new FixValueConverter(null, null);
//	}

	@ValueConverter(rule = "STRING_CONTENT")
	public IValueConverter<String> STRING_CONTENT() {
		return new FixValueConverter("8<---", "\n--->8") {
			@Override
			protected String removePrefix(String string) {
				String removed = super.removePrefix(string);
				removed = removePrefix(removed, "\r");
				removed = removePrefix(removed, "\n");
				return removed;
			}
		};
	}

	private static class FixValueConverter extends AbstractNullSafeConverter<String> {
		
		private String prefix, suffix;
		
		public FixValueConverter(String prefix, String suffix) {
			this.prefix = prefix;
			this.suffix = suffix;
		}

		@Override
		protected String internalToValue(String string, INode node) {
			string = removePrefix(string);
			string = removeSuffix(string);
			return string;
		}
		
		protected String removePrefix(String string, String prefix) {
			if (prefix != null && string.startsWith(prefix)) {
				string = string.substring(prefix.length());
			}
			return string;
		}
		
		protected String removePrefix(String string) {
			return removePrefix(string, prefix);
		}

		protected String removeSuffix(String string, String suffix) {
			if (suffix != null && string.endsWith(suffix)) {
				string = string.substring(0,  string.length() - suffix.length());
			}
			return string;
		}

		protected String removeSuffix(String string) {
			return removeSuffix(string, suffix);
		}
		
		@Override
		protected String internalToString(String value) {
			if (prefix != null && (! value.startsWith(prefix))) {
				value = prefix + value; 
			}
			if (suffix != null && (! value.endsWith(suffix))) {
				value = value + suffix; 
			}
			return value;
		}
	}
}
