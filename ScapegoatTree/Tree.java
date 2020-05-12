package ScapegoatTree;

public interface Tree<T> {
	//���������� �������� � ������, id - ����, T - ����� �����(����������� � ������� ����������)
    void push(int id, T data);

    //������������ �������� �� ������ (��� ���� ���� ��������� �� ������)
    T pop(int id);

    //����� �������� � ������ (���� �������� � ������)
    T find(int id);
}
