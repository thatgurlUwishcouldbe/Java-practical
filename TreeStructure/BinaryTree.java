
public class BinaryTree<E> {
	private TNode<E> root;
	private int size;
	
	public BinaryTree() {
		root =  null;
		size =  0;
	}

	public TNode<E> addRoot(E e) {
		TNode<E> n = new TNode<E>();
		n.setItem(e); 
		if (root == null) {
			root =  n;
			size++;
			return n;
		}
		else {
			return null;
		}
	}


	public TNode<E> addLeft(TNode<E> p, E e) {
		TNode<E> n = new TNode<E>();
		n.setItem(e); 
		if (p != null && p.getLeft() == null) {
			p.setLeft(n);
			n.setParent(p);
			size++;
			return n;
		}
		else {
			return null;
		}
	}

	public TNode<E> addRight(TNode<E> p, E e) {
		TNode<E> n = new TNode<E>();
		n.setItem(e); 
		if (p != null && p.getRight() == null) {
			p.setRight(n);
			n.setParent(p);
			size++;
			return n;
		}
		else {
			return null;
		}
	}

	public E set(TNode<E> p, E e) {
		if (p != null) {
			E re = p.getItem();
			p.setItem(e);
			return re;
		}
		else {
			return null;
		}
	}

	public boolean attach(TNode<E> p, BinaryTree<E> T1, BinaryTree<E> T2) {
		if (p.getLeft() == null && p.getRight() == null) {
			p.setLeft(T1.getRoot());
			size += T1.size(T1.getRoot());
			T1.setRoot(null);
			p.setRight(T2.getRoot());
			size += T2.size(T2.getRoot());
			T2.setRoot(null);
			return true;
		}
		else {
			return false;
		}
	}

	public E remove(TNode<E> p) {
		if (p != null) {
			if (p.getLeft() != null && p.getRight() == null) {
				if (!isRoot(p)) {
					TNode<E> pp = parent(p);
					if (left(pp) == p) {
						pp.setLeft(p.getLeft());
					}
					if (right(pp) == p) {
						pp.setRight(p.getLeft());
					}
				}
				else {
					root = p.getLeft();
				}
				E e = p.getItem();
				size--;
				return e;
			}
			if (p.getLeft() == null && p.getRight() != null) {
				if (!isRoot(p)) {
					TNode<E> pp = parent(p);
					if (left(pp) == p) {
						pp.setLeft(p.getRight());
					}
					if (right(pp) == p) {
						pp.setRight(p.getRight());
					}
				}
				else {
					root = p.getRight();
				}
				E e = p.getItem();
				size--;
				return e;
			}
			if (p.getLeft() != null && p.getRight() != null) {
				return null;
			}
			if (p.getLeft() == null && p.getRight() == null) {
				if (!isRoot(p)) {
					TNode<E> pp = parent(p);
					if (left(pp) == p) {
						pp.setLeft(null);
					}
					if (right(pp) == p) {
						pp.setRight(null);
					}
				}
				else {
					root = null;
				}
				E e = p.getItem();
				size--;
				return e;
			}
			return null;
		}
		else {
			return null;
		}
	}

	public E getElement(TNode<E> p) {
		if (p != null) {
			E e = p.getItem();
			return e;
		}
		else {
			return null;
		}
	}

	public TNode<E> parent(TNode<E> p) {
		if (p != null) {
			TNode<E> n = p.getParent();
			return n;
		}
		else {
			return null;
		}
	}

	public TNode<E> left(TNode<E> p) {
		if (p != null) {
			TNode<E> n = p.getLeft();
			return n;
		}
		else {
			return null;
		}
	}

	public TNode<E> right(TNode<E> p) {
		if (p != null) {
			TNode<E> n = p.getRight();
			return n;
		}
		else {
			return null;
		}
	}

	public TNode<E> sibling(TNode<E> p) {
		if (p != null) {
			TNode<E> n = p.getParent();
			if (n.getLeft() == p)
				return n.getRight();
			if (n.getRight() == p)
				return n.getLeft();
			return null;
		}
		else {
			return null;
		}
	}

	public TNode<E> root(TNode<E> p) {
		if (p != null) {
			TNode<E> n = p;
			while (n.getParent() != null) {
				n = n.getParent();
			}
			return n;
		}
		else {
			return null;
		}
	}

	public TNode<E> getRoot() {
		return root;
	}

	public void setRoot(TNode<E> n) {
		root = n;
	}

	public boolean isInternal(TNode<E> p) {
		if (p != null) {
			if (p.getLeft() != null || p.getRight() != null) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}

	public boolean isExternal(TNode<E> p) {
		if (p != null) {
			if (p.getLeft() == null && p.getRight() == null) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}

	public boolean isRoot(TNode<E> p) {
		if (p != null) {
			if (p.getParent() == null) {
				return true;
			}
			else {
				return false;
			}
                }
                return false;
	}

	public int size(TNode<E> p) {
		if ( p == null)
			return 0;
		else 
			return 1 + size(left(p)) +  size(right(p));
	}

	public boolean isEmpty(TNode<E> p) {
		if (p == null) {
			return true;
		}
		else {
			return false;
		}
	}
		

	public void preOrder(TNode<E> root) {
		if (root != null) {
			System.out.println(root.getItem());
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
	}

	public void inOrder(TNode<E> root) {
		if (root != null) {
			inOrder(root.getLeft());
                        System.out.println(root.getItem());
			inOrder(root.getRight());
			
			
		}
	}

	public void postOrder(TNode<E> root) {
		if (root != null) {
			postOrder(root.getLeft());
			postOrder(root.getRight());
			System.out.println(root.getItem());
		}
	}

}
