package grafikeditor.graphiti;

public class MeinEditorFileExtensions implements de.jabc.cinco.meta.core.referenceregistry.implementing.IFileExtensionSupplier {
	
	@Override
	public java.util.List<java.lang.String> getKnownFileExtensions() {
		return java.util.Arrays.asList(new java.lang.String[] { "meineditor"});
	}
}
