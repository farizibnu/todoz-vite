<template>
  <div class="fixed inset-0 bg-black opacity-85 flex justify-center items-center z-50">
    <div class="bg-white p-6 rounded-xl w-96 shadow-lg">
      <h2 class="text-xl font-bold mb-4">Tambah Todo</h2>
      <form @submit.prevent="submitTodo" class="flex flex-col gap-4">
        <input v-model="todo.name" type="text" placeholder="Nama Todo" class="p-2 border rounded" required />
        <input v-model="todo.deadline" type="date" class="p-2 border rounded" required />
        <textarea v-model="todo.description" placeholder="Deskripsi" class="p-2 border rounded" required></textarea>
        
        <div class="flex justify-end gap-2">
          <button type="button" @click="$emit('close')" class="px-4 py-2 border rounded">Batal</button>
          <button type="submit" class="px-4 py-2 bg-blue-600 text-white rounded">Simpan</button>
        </div>
      </form>
    </div>
  </div>
</template>

<script setup>
    import { ref } from 'vue';

    const emit = defineEmits(['close', 'add-todo']);

    const todo = ref({
        name: '',
        deadline: '',
        description: ''
    });

    function submitTodo() {
        if (todo.value.name && todo.value.deadline && todo.value.description) {
            emit('add-todo', { ...todo.value });
            todo.value = { name: '', deadline: '', description: '' }; 
            emit('close');
        }
    }
</script>